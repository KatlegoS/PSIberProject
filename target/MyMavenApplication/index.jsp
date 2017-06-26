<html>
<head>
<style type="text/css">
p {text-align:center;}
</style>
</head>
<body>
<form name="taxCalculationForm" action="calculateTax" method="post">
<p><h1>Tax Calculator</h1></p>
<br/>
<br/>
<p><label for="taxYear">Tax Year</label>
<select name="taxYear">
    <option value="2017">2017</option>
    <option value="2018">2018</option>
  </select>
</p>
<br/>
<br/>
<p><label for="age">Age</label> <input type="text" name="age"/></p>
<br/>
<br/>
<p><label for="totalTaxableEarnings">Total Taxable Earnings</label><input type="text" name="totalTaxableEarnings"/></p>
<br/>
<br/>
<p><label for="type">
Type:
</label>
<input type="radio" name="type" value="monthly" />Monthly
<input type="radio" name="type" value="annually" />Annual
</p>
<br/>
<br/>
<p><label for="medicalAidMembers">Medical Aid Members(Main member included)</label> <input type="text" name="medicalAidMembers"/></p>
<br/>
<br/>
<p><input type="submit" value="Submit"></p>

</form>
</body>
</html>
