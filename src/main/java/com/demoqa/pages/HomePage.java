package com.demoqa.pages;

import com.demoqa.pages.alerts_frames_windows.Alerts_Frame_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;
import static utilities.JavascriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formCard = By.xpath("//h5[normalize-space()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertsFrameWindowsCard = By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]");

    public FormPage goToForm() {
        scrollToElementJS(formCard);
        click(formCard);
        return new FormPage();
    }

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }
    public Alerts_Frame_WindowsPage goToAlerts_Frame_WindowsPage() {
        scrollToElementJS(alertsFrameWindowsCard);
        click(alertsFrameWindowsCard);
        return new Alerts_Frame_WindowsPage();
    }
}

