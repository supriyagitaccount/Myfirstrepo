Feature:Home Page
 
@smoketest
Scenario:Search button Functinality
Given : I am on home page
When : I enter product name in search and enter
Then : I navigate to particular product

@sanitytest
Scenario:About page Functinality
Given : I am on home page
When : I click on about 
Then : I navigate to about page

@sanitytest
Scenario:Feedback page Functinality
Given : I am on home page
When : I click on feedback
Then : I navigate to feedback page

@regressiontest
Scenario:All page Functinality
Given : I am on home page
When : I click on all
Then : I navigate to all product list