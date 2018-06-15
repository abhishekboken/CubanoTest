
# Find the New Zealand citizenship status
As a test automation engineer
I need to find if a person is the citizen of New Zealand with the given situation

## Acceptance Criteria
* The link to NZ citizenship eligibility should be accessible 

## [NZ Citizenship Status Check](-)
Given I was not born in New Zealand, the Cook Islands, Niue or Tokelau
Given I am not a Samoan citizen
Given none of my parents were NZ citizen at the time of my birth
Given I have been living in New Zealand, the Cook Islands, Niue or Tokelau as a resident for at least the last 5 years
When I want to check the NZ citizenship status with given situation
Then I should get the citizenship status as : [You are not a New Zealand citizen but you may meet the requirements for NZ citizenship] (- "?=govtNZ()")
