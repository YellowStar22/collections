package table;

import java.util.Arrays;

public class TableManipulation {

	
	/***
	 * 
	 * @param tab
	 * @param p
	 * @return
	 */
	 public static int[][] shiftToTheLeft(int tab[][], int p) {
	        int[][] leftShiftedTab = new int[tab.length][tab[0].length];
	        System.arraycopy(tab, p, leftShiftedTab, 0, tab.length - p);
	        return leftShiftedTab;
	 }
	 
	 /***
	  * Permet de parcourir des tableaux en profondeur
	  * @param tab
	  */
	 
	 public static void showTable(int tab[][]) {
	        System.out.println(Arrays.deepToString(tab));
	 }
}
