package easy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomForm {
	
	public PomForm() {
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[1]")
	private WebElement inputForm;
	public WebElement getinputForm()
	{
		return inputForm;
	}
	@FindBy(xpath="(//a[text()='Simple Form Demo'])[1]")
	private WebElement simple;
	public WebElement getsimple()
	{
		return simple;
	}
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[1]")
	private WebElement checkForm;
	public WebElement getcheckForm()
	{
		return checkForm;
	}
	@FindBy(xpath="(//a[text()='Checkbox Demo'])[1]")
	private WebElement demo;
	public WebElement getdemo()
	{
		return demo;
	}
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[1]")
	private WebElement Radio;
	public WebElement getRadio()
	{
		return Radio;
	}
	@FindBy(xpath="(//a[text()='Radio Buttons Demo'])[1]")
	private WebElement rBtn;
	public WebElement getrBtn()
	{
		return rBtn;
	}
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[1]")
	private WebElement select;
	public WebElement getselect()
	{
		return Radio;
	}
	@FindBy(xpath="//a[text()='Select Dropdown List']")
	private WebElement selbt;
	public WebElement getselbt()
	{
		return selbt;
	}
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[1]")
	private WebElement submit;
	public WebElement getsubmit()
	{
		return submit;
	}
	@FindBy(xpath="//a[text()='Input Form Submit']")
	private WebElement Subform;
	public WebElement getSubform()
	{
		return Subform;
	}
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[1]")
	private WebElement Ajax;
	public WebElement getAjax()
	{
		return Ajax;
	}
	@FindBy(xpath="//a[text()='Ajax Form Submit']")
	private WebElement Ajaxform;
	public WebElement getAjaxform()
	{
		return Ajaxform;
	}
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[1]")
	private WebElement DropDown;
	public WebElement getDropDown()
	{
		return Ajax;
	}
	@FindBy(xpath="//a[text()='JQuery Select dropdown']")
	private WebElement seltdrop;
	public WebElement getseltdrop()
	{
		return seltdrop;
	}

}
