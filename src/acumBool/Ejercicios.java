package acumBool;

public class Ejercicios {
	public static void main(String[] args) {
		int[] arr1 = {4,1};
		int[] arr2 = {1,2,3};
		System.out.println("Pertenecen todos:" + pertenecenTodos(arr1,arr2));


	}
	
	public static boolean pertenecenTodos(int[] elems, int[] arreglo) {

		boolean todos=true, esta;
		
		for(int i=0; i<elems.length; i++) {
			
			esta = false;
			for(int j=0; j<arreglo.length; j++)
				esta = esta || elems[i]==arreglo[j];
			
			todos = todos && esta;
		}
		return todos;
	}
	
	public static boolean pertenecenTodos2(int[] elems, int[] arreglo) {
		boolean todos=true;
		for(int i=0; i<elems.length; i++) {
			todos = todos && pertenece(elems[i], arreglo);
		}
		return todos;
	}
	
	public static boolean pertenece(int elem, int[] arreglo) {
		
		boolean esta = false;
		for(int j=0; j<arreglo.length; j++)
			esta = esta || elem==arreglo[j];
		return esta;
	}
	
	
	
}
