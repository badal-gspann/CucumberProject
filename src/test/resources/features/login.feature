Feature:Login Feature

Scenario: User Should be Able to Sign In Successfully
	Given User is on shopping site
	When User enter username
	And User enter password
	And User click on Sign in
    Then User should be on accounts page