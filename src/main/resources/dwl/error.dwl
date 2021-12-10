%dw 2.0
output application/json
---
{
	statusCode: vars.httpStatus,
	message: error.errorType.identifier,
	description: error.description
}