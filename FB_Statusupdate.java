package com.example.tests;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class Fb_Statusupdate extends SeleneseTestCase {
	public void setUp() throws Exception {
		setUp("http://www.facebook.com/", "*chrome");
	}
	public void testFb_Statusupdate() throws Exception {
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head profile="http://selenium-ide.openqa.org/profiles/test-case">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="selenium.base" href="http://www.facebook.com/" />
<title>FB_StatusUpdate</title>
</head>
<body>
<table cellpadding="1" cellspacing="1" border="1">
<thead>
<tr><td rowspan="1" colspan="3">FB_StatusUpdate</td></tr>
</thead><tbody>
<tr>
	<td>open</td>
	<td>/</td>
	<td></td>
</tr>
<tr>
	<td>type</td>
	<td>email</td>
	<td>NumberFour.Swati@gmail.com</td>
</tr>
<tr>
	<td>type</td>
	<td>pass</td>
	<td>swati1234</td>
</tr>
<tr>
	<td>clickAndWait</td>
	<td>//label/input</td>
	<td></td>
</tr>
<tr>
	<td>clickAndWait</td>
	<td>link=Home</td>
	<td></td>
</tr>
<tr>
	<td>type</td>
	<td>//textarea</td>
	<td>I am here on 28th May, at 21:52.</td>
</tr>
<tr>
	<td>click</td>
	<td>link=Everyone</td>
	<td></td>
</tr>
<tr>
	<td>click</td>
	<td>//li[1]/div/div/div[1]/div/div/div/ul/li[4]/a/span</td>
	<td></td>
</tr>
<tr>
	<td>select</td>
	<td>//td/select</td>
	<td>label=Friends of Friends</td>
</tr>
<tr>
	<td>click</td>
	<td>save-settings</td>
	<td></td>
</tr>
<tr>
	<td>click</td>
	<td>//li[2]/label/input</td>
	<td></td>
</tr>
<tr>
	<td>click</td>
	<td>link=Most Recent</td>
	<td></td>
</tr>
<tr>
	<td>click</td>
	<td>//div[3]/div[3]/div/div/div[1]/div/div/div/div/ul/li[2]/a/span</td>
	<td></td>
</tr>
</tbody></table>
</body>
</html>
	}
}
