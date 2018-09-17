# CommentValidation
Product comment validation rest api using spring boot
It implements a small REST api of type GET and accepts the RequestParameter 'comment' of type String. 
It validates the user comment against the set of pre-decided unacceptable words that should be avoided in the comments that appear in the product page. 
If the user comment found to contain any of those words, the response will be an appropriate message in the JSON format. 
The front end application can appropriately dispaly to user.
In both the situation, the response will be sent accordingly.

Once the service is started in local machine, it can be accessed by using below service end point
localhost:8082/product/comment/validate

For example:
localhost:8082/product/comment/validate?comment=The product looks invalidWord1 and notGoodWord4

The service was configured to run on 8082 port
