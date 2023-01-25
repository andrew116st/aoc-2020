package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tropical_island {
	
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("01_trop_island");
		
		List<Integer> hh = new ArrayList<>();
		
		
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {

			String line = sc.nextLine();
			
			int temp = Integer.parseInt(line);
			
			hh.add(temp);
			
			//System.out.println(hh.size());
			
		}
		sc.close();

		for (int i = 0; i < hh.size() - 1; i++) {
			int sum = 2020;
			for (int j = i + 1; j < hh.size(); j++) {

				sum = hh.get(i) + hh.get(j);
				
				if (sum == 2020) {
					System.out.println("первое число " + hh.get(i) + ", второе число " + hh.get(j));
					System.out.println("Умножение полученных чисел - " + hh.get(i)*hh.get(j) );
				}
			}
			

		}

	}

}

	