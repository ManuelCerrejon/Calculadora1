package Clases;

public class empleado {
	enum TipoEmpleado {vendedor, encargado};

	static float  calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		 float nominabruta=0;
		 float salarioBase=0;
		 if(tipo==TipoEmpleado.vendedor) {
			 salarioBase=2000;
		 }else {
			 salarioBase=2500;
		 }
		 
		 if(ventasMes>=1000) {
			 if(ventasMes>=1500) {
				 nominabruta=salarioBase+200+(horasExtra*30);
			 }else {
				 nominabruta=salarioBase+100+(horasExtra*30);
			 }
		 }else {
			 nominabruta=salarioBase+(horasExtra*30);
		 }
		 return nominabruta;
	 }
	 
	 static float calculoNominaNeta(float nominaBruta) {
		 //Si la nomina bruta es menor de 1100 euros, no se aplicará ninguna retención. 
		 //Para nominas superiores a 1100 pero menores de 1500 euros se les aplicará un 15%. 
		 //Para salarios a partir de 1500 euros se les aplicará un 18%. El método devuelve nominaBruta * (1-retencion).
		 float retencion=0;
		 if(nominaBruta>=2100) {
			 if(nominaBruta>=2500) {
				 retencion=0.18f;
			 }else {
				 retencion=0.15f;
			 }
		 }
		 
		 return nominaBruta*(1-retencion);
	 }

}
