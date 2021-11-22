Feature: Homepage
Scenario: Verify the functionality of Featured proprerties
Given Initialize the browser with chrome
And Navigate to "http://realty-real-estatem1.upskills.in/" site
Then click on invest in overseas
And click on blog
When click on Realty
Then navigate to Realty page
When click on Home loan
Then navigate to Home loan
When click on Interior
Then navigate toInteriors
When click on Legal
Then navigate to Legal
And click on browse properties
When click on share details

@footer
Scenario: footer
Given Initialize the browser with chrome
And Navigate to "http://realty-real-estatem1.upskills.in/" site
Then I check Helpful links working present in footer

When I check contact us details presnet in footer or not
Then I print contact details

When I click on social media links
 



