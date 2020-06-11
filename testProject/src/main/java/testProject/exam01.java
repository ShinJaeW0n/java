package testProject;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class exam01 {

	    
	    public static void main(String[] args) {
	        
	        // ���� package�� workspace ���, Windows�� [ chromedriver.exe ]
	       // Path path = Paths.get(System.getProperty("user.dir"), "src/main/resources/chromedriver");  // ���� package��
	        
	        // WebDriver ��� ����
//	        System.setProperty("webdriver.chrome.driver", path.toString());
	    	System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver/chromedriver.exe");
	        
	        // WebDriver �ɼ� ����
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");            // ��üȭ������ ����
	        options.addArguments("--disable-popup-blocking");    // �˾� ����
	        options.addArguments("--disable-default-apps");     // �⺻�� ������
	        
	        // WebDriver ��ü ����
	        ChromeDriver driver = new ChromeDriver( options );
	        
	        // �� �� ����
//	        driver.executeScript("window.open('about:blank','_blank');");
	        
	        // �� ��� ��������
	        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        
	        
	        
	        // ù��° ������ ��ȯ
//	        driver.switchTo().window(tabs.get(0));
	        
	        // �������� ��û
	        driver.get("https://www.koreabaseball.com/Record/Player/HitterBasic/Basic1.aspx");
	        
	        // ������������ ������ ��������
	        List<WebElement> years = driver.findElementsByXPath("//select[@name='ctl00$ctl00$ctl00$cphContents$cphContents$cphContents$ddlSeason$ddlSeason']/option selected=\"selected\" value=\"2018\">2018</option>");
	        
	        // �������� �ҽ� ���
	        //System.out.println( driver.getPageSource() );
	        
	        // �� ����
	        
	        
	        // 5�� �Ŀ� WebDriver ����
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            // WebDriver ����
	            driver.quit();
	        }
	    }
	}


