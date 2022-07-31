package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TFLSearchResultsPage extends PageObject {
    public static final Target SEARCH_RESULTS_HEADING = Target.the("Search headline")
            .locatedBy(".hero-headline");

    public static final Target FIRST_ARTICLE_HEADING = Target.the("first article heading")
            .locatedBy(".search-results h3");
}
