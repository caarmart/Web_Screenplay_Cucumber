package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.amazon.com")
public class AmazonPage extends PageObject {
    public static final Target SEARCH_INPUT = Target.the("Search input target").located(By.id("twotabsearchtextbox"));
    public static final Target SEARCH_BUTTON = Target.the("Search button").located(By.id("nav-search-submit-button"));
    public static final Target SECOND_PAGE_BUTTON = Target.the("Second page button").located(By.xpath("//*[contains(@href,'pg_2')]"));
    public static final Target THIRD_ITEM_BUTTON = Target.the("Second item button").located(By.xpath("//*[@data-index='2' or @data-index='7']//*[@class='a-link-normal a-text-normal']"));
    public static final Target AVAILABILITY_BUTTON = Target.the("Availability button").located(By.id("buybox-see-all-buying-choices"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button").located(By.id("a-autoid-2-offer-1"));
    public static final Target DIRECTLY_ADD_TO_CART_BUTTON = Target.the("Add to cart button directly").located(By.id("submit.add-to-cart"));
    public static final Target X_BUTTON = Target.the("X button").located(By.id("aod-close"));
    public static final Target CART_BUTTON = Target.the("Cart button").located(By.id("nav-cart"));
    public static final Target ITEM_NAME_TEXT = Target.the("Item name text").located(By.id("productTitle"));
    public static final Target OUT_STOCK_MESSAGE = Target.the("Out of stock message").located(By.id("outOfStock"));
    public static final Target EXPECTED_ITEM_NAME = Target.the("Expected item name").located(By.className("a-truncate-cut"));
}