import geb.Page
import geb.Module

class YummyNoodleHomePage extends Page {

    static at = { title == "Yummy Noodle Bar" }

    static content = {
        homeButton { $(href: "/") }
				showBasketNavButton { $(href: "/showBasket") }
				springButton { $("a", class: "btn btn-primary btn-large")}
				showBasketLargeButton { $("a", class: "btn btn-primary btn-larg", href: "/showBasket")}
				menuTable { $("table", 0) }
				menuItemRow { module MenuItemRow, MenuItemRows[it] }
				menuItemRows(required: false) { menuTable.find("tbody").find("tr") }    
}

}
class MenuItemRow extends Module {
	static content = {
		cell { $("td", it) }
		cellText { cell(it).text() }
		itemId { cellText(1) }
		itemName { cellText(2) }
		itemPrice { cellText(3) }
		itemMinutes { cellText(4) }
		addToBasket { cellText(5) }
	}
}
