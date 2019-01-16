package easy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ActionPom {
	public ActionPom() {
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(xpath="//input[@id='user-message']")
	private WebElement enter;
	public WebElement getenter()
	{
		return enter;
	}
	@FindBy(xpath="//button[text()='Show Message']")
	private WebElement button;
	public WebElement getbutton()
	{
		return button;
	}
	@FindBy(xpath="//input[@id='sum1']")
	private WebElement firstValue;
	public WebElement getfirstValue()
	{
		return firstValue;
	}
	@FindBy(xpath="//input[@id='sum2']")
	private WebElement secondValue;
	public WebElement getsecondValue()
	{
		return secondValue;
	}
	@FindBy(xpath="//button[text()='Get Total']")
	private WebElement finish;
	public WebElement getfinish()
	{
		return finish;
	}
	@FindBy(id="isAgeSelected")
	private WebElement tick;
	public WebElement gettick()
	{
		return tick;
	}
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement option;
	public WebElement getoption()
	{
		return option;
	}
	@FindBy(id="check1")
	private WebElement check;
	public WebElement getcheck()
	{
		return check;
	}
	@FindBy(xpath="(//input[@value='Female'])[1]")
	private WebElement value;
	public WebElement getvalue()
	{
		return value;
	}
	@FindBy(id="buttoncheck")
	private WebElement vclick;
	public WebElement getvclick()
	{
		return vclick;
	}
	@FindBy(name="gender")
	private WebElement gender;
	public WebElement getgender()
	{
		return gender;
	}
	@FindBy(name="ageGroup")
	private WebElement age;
	public WebElement getage()
	{
		return age;
	}
	@FindBy(xpath="//button[text()='Get values']")
	private WebElement genagevalue;
	public WebElement getgenagevalue()
	{
		return genagevalue;
	}
	@FindBy(id="select-demo")
	private WebElement day;
	public WebElement getday()
	{
		Select sc=new Select(day);
		sc.selectByIndex(3);
		return day;
	}
	@FindBy(id="multi-select")
	private WebElement country;
	public WebElement getcountry()
	{
		Select sc1=new Select(country);
		sc1.selectByIndex(3);
	
		return country;
	}
	
	@FindBy(xpath="//button[text()='First Selected']")
	private WebElement selbtn;
	public WebElement getselbtn()
	{
		
		return selbtn;
	}
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement name;
	public WebElement getname() {
		return name;
	}
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lname;
	public WebElement getlname() {
		return lname;
	}
	@FindBy(xpath="//input[@placeholder='E-Mail Address']")
	private WebElement email;
	public WebElement getemail() {
		return email;
	}
	@FindBy(name="phone")
	private WebElement pno;
	public WebElement getpno() {
		return pno;
	}
	@FindBy(xpath="//input[@placeholder='Address']")
	private WebElement Address;
	public WebElement getAddress() {
		return Address;
	}
	@FindBy(xpath="//input[@placeholder='city']")
	private WebElement loc;
	public WebElement getloc() {
		return loc;
	}
	@FindBy(xpath="//select[@name='state']")
	private WebElement state;
	public WebElement getstate() {
		return state;
	}
	@FindBy(xpath="//option[text()='Arkansas']")
	private WebElement stateclk;
	public WebElement getstateclk() {
		return stateclk;
	}
	@FindBy(xpath="//input[@placeholder='Zip Code']")
	private WebElement zip;
	public WebElement getzip() {
		return zip;
	}
	@FindBy(xpath="//input[@placeholder='Website or domain name']")
	private WebElement website;
	public WebElement getwebsite() {
		return website;
	}

	@FindBy(name="hosting")
	private WebElement hosting;
	public WebElement gethosting() {
		return hosting;
	}
	@FindBy(name="comment")
	private WebElement desc;
	public WebElement getdesc() {
		return desc;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement send;
	public WebElement getsend() {
		return send;
	}
	@FindBy(id="title")
	private WebElement Aname;
	public WebElement getAname() {
		return Aname;
	}
	@FindBy(id="description")
	private WebElement comment;
	public WebElement getcomment() {
		return comment;
	}
	@FindBy(id="btn-submit")
	private WebElement Ajaxclk;
	public WebElement getAjaxclk() {
		return Ajaxclk;
	}
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement jQuery;
	public WebElement getjQuery()
	{
	
		return country;
	}
	
}
