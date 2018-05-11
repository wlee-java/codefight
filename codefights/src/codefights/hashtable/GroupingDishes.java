package codefights.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class GroupingDishes {

	public static void main(String[] args) {
		GroupingDishes s = new GroupingDishes();
		
		String[][] dishes = 
				{
				 {"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
		         {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
		         {"Quesadilla", "Chicken", "Cheese", "Sauce"},
		         {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}
		        };
		            		
		s.groupingDishes(dishes);

	}
	
	String[][] groupingDishes(String[][] dishes) {
		
		Map<String, List<String>> tableOfIngredients = new TreeMap<String, List<String>>();
		int maxListLength = 0;
		
		for (int i=0;i<dishes.length;i++) {
			String dish = dishes[i][0];
			for (int j=1;j<dishes[i].length;j++) {
				List<String> listOfDishes = new ArrayList<String>();
				String ingredient = dishes[i][j];
				if (!tableOfIngredients.containsKey(ingredient)) {
					//add ingredient to table
					listOfDishes.clear();
				} else {
					listOfDishes = tableOfIngredients.get(ingredient);
				}
				//add to new lists or existing list
				listOfDishes.add(dish);
//				System.out.println("adding these dishes " + listOfDishes + "  " + ingredient);
				//sort the dishes while here.
				Collections.sort(listOfDishes);
				if (maxListLength < listOfDishes.size()) {
					maxListLength = listOfDishes.size();
				}
				tableOfIngredients.put(ingredient,listOfDishes);			
			}
		}

		
		//sort the ingredients
		String[] ingredients = new String[tableOfIngredients.size()];
		int idx=0;
        for(String ig : tableOfIngredients.keySet()) {
        	ingredients[idx++] = ig;
        }
        Arrays.sort(ingredients);
        
        //loop around the ingredients and then get the already sorted dishes.  Add to returnVal
        List<String> ingredientsList = new ArrayList<String>();
        List<String> ingredientsAndDishesList = new ArrayList<String>();
        idx=0;
        for (int i=0;i<ingredients.length;i++) {
        	//get dishes
        	List<String> listOfDishes = tableOfIngredients.get(ingredients[i]);
        	int size = listOfDishes.size();	
        	if (size > 1 ) {
        		ingredientsList.add(ingredients[i]);
        		ingredientsAndDishesList.add(ingredients[i]);
        		for (int j=0;j<size;j++) {
        			ingredientsAndDishesList.add(listOfDishes.get(j));
        		}
        	}
        }        
        
        //change arraylist to arrays.   Unfinished.
        String[][] returnVal = new String[ingredientsAndDishesList.size()][];
        for (int i=0;i<ingredientsAndDishesList.size();i++) {
//        	String s = ingredientsAndDishesList.get(i);
        }
        
        return returnVal;

	}
}



