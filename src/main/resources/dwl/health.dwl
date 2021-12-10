%dw 2.0
output application/json
---
{
	servicename:"generic DB",
	status: if(payload  == null)
	"down"
	 else
	"up"
	
}