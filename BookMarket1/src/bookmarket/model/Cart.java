package bookmarket.model;

import java.util.ArrayList;

public class Cart {
	
	private ArrayList<CartItem> itemList = new ArrayList<>();
	
	public String getItemInfo(int i) {
		return itemList.get(i).toString();
	}
	
	public boolean isInCart(Book book) {
		return false;
	}
	
	public ArrayList<CartItem> getItemList() {
		return itemList;
	}
	
	public void addItem(Book book) {
		
		CartItem item = getCartItem(book);
		if(item == null) {
			itemList.add(new CartItem(book));			
		} else {
			item.addQuantity(1);
		}
	}
	
	private CartItem getCartItem(Book book) {
		for (CartItem item : itemList) {
			if(item.getBook() == book) {
				return item;				
			}
		}
		return null;
	}

	public int getNumItems() {
		return itemList.size();
	}
	
	public boolean isEmpty() {
		return itemList.isEmpty();
	}

	public void resetCart() {
		itemList.clear();
	}
	
	public boolean isValidBook(int bookId) {
		for(CartItem item : itemList) {
			if(item.getBook().getBookId() == bookId) {
				return true;
			}
		}
		return false;
	}
	
	
}
