package bookmarket.controller;

import bookmarket.model.BookStorage;
import bookmarket.model.Cart;
import bookmarket.view.ConsoleView;

public class BookMarketController {
	ConsoleView view;
	BookStorage mBookStorage;
	Cart mCart;
	String[] menuList = {
			"0. 종료", "1. 도서보기", "2. 장바구니 보기", "3. 장바구니에 도서 담기", "4. 장바구니 도서 삭제", "5. 장바구니 도서 수량 변경", "6. 장바구니 비우기", "7. 주문"
	};
	
	public BookMarketController(ConsoleView view, BookStorage mBookStorage, Cart mCart) {
		this.view = view;
		this.mBookStorage = mBookStorage;
		this.mCart = mCart;
	}
	
	public void start() {
		view.displayWelcome();
		
		int menu;
		
		do {
			menu = view.selectMenu(menuList);
			switch (menu) {
			case 1 -> viewBookInfo();
			
			case 2 -> viewCart();
			
			case 3 -> addBook2Cart();
			
			case 4 -> deleteBookInCart();
			
			case 5 -> updateBookInCart();
			
			case 6 -> resetCart();
			
			case 7 -> order();
			
			case 0 -> end();
			
			default -> view.showMessage("잘못된 메뉴 번호입니다.");
			}
		} while(menu != 0);
		
		view.showMessage(">> LJSuuuuu Book Market을 종료합니다.");
	}

	private void end() {
		view.showMessage(">> LJSuuuuu Book Market을 종료합니다");
	}

	private void deleteBookInCart() {
		view.displayCart(mCart);
		if(!mCart.isEmpty()) {
			int bookId = view.selectBookId(mCart);
		}
		
	}
	
	private void order() {
		
	}

	private void updateBookInCart() {
		
	}

	private void viewBookInfo() {
		view.displayBookInfo(mBookStorage);
	}
	
	private void viewCart() {
		view.displayCart(mCart);
	}
	
	private void resetCart() {
		view.displayCart(mCart);
		if(!mCart.isEmpty()) {
			if(view.askConfirm(">> 장바구니를 비우려면 Yes를 입력하세요 : ", "Yes")) {
				mCart.resetCart();
				view.showMessage(">> 장바구니가 비워졌습니다.");
			}
		}
	}
	
	private void addBook2Cart() {
		view.displayBookInfo(mBookStorage);
		int bookId = view.selectBookId(mBookStorage);
		mCart.addItem(mBookStorage.getBookId(bookId));
		view.showMessage("장바구니에 도서를 추가하였습니다.");
	}
	
}
