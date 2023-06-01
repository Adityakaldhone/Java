class Store {
    private String name = "My Store";
    Store() {
    	    this.name = name;
	    System.out.println("Welcome To  "+name);
    }

}
class GroceryStore extends Store {
	GroceryStore(){
        
		System.out.println("Welcome to Grocery shop");
	}
}
class Products extends GroceryStore{
    private String name;
    private int price;
     Products() {
       
     	     System.out.println("Product name = Fruits");
    }
} 

class Fruit extends Products {
     Fruit(){
 
	    System.out.println("Fruitname =  Mango");
	    System.out.println("Fruitprice =  500Rs");
    }
}

class Customer{
	public static void main(String[] args) {
        
		Fruit obj  = new Fruit();
	}
}
/*
output:
root@LAPTOP-382C9LGN:~/Java/Java/classcodes/Inheritance/59# java Customer
Welcome To  My Store
Welcome to Grocery shop
Product name = Fruits
Fruitname =  Mango
Fruitprice =  500Rs
root@LAPTOP-382C9LGN:~/Java/Java/classcodes/Inheritance/59#
*/
