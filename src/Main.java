
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import Set.SetManipulation;
import model.Element;
import model.ElementMapper;
import table.TableManipulation;
public class Main {
	

	public static void main(String[] args) {
		SetManipulation.parcourirElement();
		
		
		int [][] tab = {{1,2,3,4,5,6},{2,3,4,5,6,7},{3,4,5,6,7,8}};
		TableManipulation.shiftToTheLeft(tab, 1);
		
		TableManipulation.showTable(tab);
			
			
	}
	
}
