package stepdefs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchFlightStep {
	
	public static AndroidDriver<MobileElement> driver;

	@Given("user on the home screen")
	public void user_on_the_home_screen() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0");
		cap.setCapability("automationName", "uiAutomator2");
		cap.setCapability("appPackage", "com.traveloka.android");
		cap.setCapability("appActivity","com.traveloka.android.appentry.splash.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, cap);
		
		MobileElement yourLocation = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.EditText");
		yourLocation.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement indonesia = (MobileElement) driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
		indonesia.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement lanjutkanButton = (MobileElement) driver.findElementById("com.traveloka.android:id/on_board_button_continue");
		lanjutkanButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement lewatiButton = (MobileElement) driver.findElementById("com.traveloka.android:id/text_skip");
		lewatiButton.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement masukButton = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView");
		masukButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement lanjut = (MobileElement) driver.findElementById("com.traveloka.android:id/text_view_tooltip_ok");
		lanjut.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement ok = (MobileElement) driver.findElementById("com.traveloka.android:id/text_view_tooltip_ok");
		ok.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement skip = (MobileElement) driver.findElementById("com.traveloka.android:id/view_above_tooltip_pointer");
		skip.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement nanti = (MobileElement) driver.findElementById("com.traveloka.android:id/button_later");
		nanti.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("user click tiket pesawat")
	public void user_click_tiket_pesawat() {
		MobileElement tiketPesawat = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		tiketPesawat.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("user select Dari with Jakarta")
	public void user_select_dari_with_jakarta() {
		MobileElement dari = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.EditText");
		dari.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement searchBox1 = (MobileElement) driver.findElementById("com.traveloka.android:id/edit_text_field");
		searchBox1.sendKeys("Jakarta");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement jakarta = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		jakarta.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("user select Ke with Padang")
	public void user_select_ke_with_padang() {
		MobileElement ke = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"flight_searchform_view_container\"]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.EditText");
		ke.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement searchBox2 = (MobileElement) driver.findElementById("com.traveloka.android:id/edit_text_field");
		searchBox2.sendKeys("Padang");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement padang = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]");
		padang.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("user click Cari")
	public void user_click_cari() {
		MobileElement cariButton = (MobileElement) driver.findElementByAccessibilityId("flight_searchform_button_search");
		cariButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("user click first result flight")
	public void user_click_first_result_flight() {
		MobileElement okMengerti = (MobileElement) driver.findElementById("com.traveloka.android:id/button_tooltip");
		okMengerti.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement hasilPenerbanganPertama = (MobileElement) driver.findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"flight_result_container_view\"])[1]/android.view.ViewGroup");
		hasilPenerbanganPertama.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("user click Pilih")
	public void user_click_pilih() {
		MobileElement prompt = (MobileElement) driver.findElementById("com.traveloka.android:id/text_view_tooltip");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement pilih = (MobileElement) driver.findElementById("com.traveloka.android:id/button_select");
		pilih.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("user navigate to Isi data screen")
	public void user_navigate_to_isi_data_screen() {
		MobileElement pesan = (MobileElement) driver.findElementById("com.traveloka.android:id/tvCurrent");
		if(pesan.isDisplayed()) {
			System.out.println("ok");
		}
	}
}
