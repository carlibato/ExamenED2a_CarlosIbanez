package examen;
/**
 * 
 * @author daw1xx
 * @version 1.0
 */
public class Fecha {
	/**
	 * boolean en el que se introducen los datos anio, mes y dia
	 * @param anio
	 * @param mes
	 * @param dia
	 * @return
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		boolean fechaValida = extracted();
		/*
		 * Si el dia es mayor que 0, el mes es mayor que 0 y el anio es mayor que 0 sigue con el siguiente if
		 */
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			/*
			 * Si el mes es menor o igual que 12 y el dia es menor o igual que 31 sigue con el if
			 */
			if ((mes <= 12) && (dia <= 31)) {
				/*
				 * Si mes es igual a 2 el dia en la fecha sera 28
				 */
				if (mes == 2) {
					fechaValida = dia <= 28;
					/*
					 * Si el resto de dividir el mes entre 2 es igual que 0, el dia de la fecha es 30
					 */
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
					/*
					 * si el dia no es ni 28 ni 30 devuelve 31
					 */
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
/**
 * atributo publico de la clase fecha y es inicializado en el metodo validarFecha
 * @return
 */
	public static boolean extracted() {
		boolean fechaValida = false;
		return fechaValida;
	}
}