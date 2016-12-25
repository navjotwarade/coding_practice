package designPatterns;

import java.util.ArrayList;
import java.util.List;
interface item{
	public String name();
	Packing packing();
	float cost();
}
interface Packing{
	String pack();
}
class mealBuilder{
	public meal prepareVegMeal(){
		meal meal = new meal();
		meal.addItem(new vegBurger());
		meal.addItem(new coke());
		return meal;
		}
	public meal prepareNonVegMeal(){
		meal meal = new meal();
		meal.addItem(new chickenBurger());
		meal.addItem(new pepsi());
		return meal;
		}
	
}
class meal{
	List list = new ArrayList();
	
	public void addItem(item item){
		list.add(item);
	}
	public void showItems(){
		System.out.println(list.toString());
	}
}
class vegBurger extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class chickenBurger extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class pepsi extends coldDrink{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class coke extends coldDrink{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float cost() {
		return 0;
	}
	
}
class wrapper extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class bottle extends coldDrink{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
abstract class Burger implements item{
	public wrapper pack(){
		return new wrapper();
	}
}
abstract class coldDrink implements item{
	public bottle pack(){
		return new bottle();
	}
}

public class builderPattern {

	public static void main(String[] args) {
		mealBuilder mb = new mealBuilder();
		meal vegMeal = mb.prepareVegMeal();
		vegMeal.showItems();
		
	}
}
