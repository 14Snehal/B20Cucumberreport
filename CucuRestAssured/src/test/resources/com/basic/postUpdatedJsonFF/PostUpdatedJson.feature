Feature: First Rest Assured test POST 

Scenario Outline: Test my POST request test
Given  user hit the post request with "<name>" name and "<job>" job
#When user hit the post request
#Then user checks data at path "<name>" having value "<job>" in jason

Examples:
	| name    		|  job   | 
	| Anil		    |  Lead  |
	| Pratha    	|  QA    |
	| Pragya    	|	 QA    |


#When user hit the get request
#Then user checks 200 the status code
#Then user checks the count or size
#Then user checks "albert_park" value
#Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0]" with the "albert_park" value




