# CommentValidation
Product comment validation rest api using spring boot
It implements a small REST api of type GET and accepts the RequestParameter 'comment' of type String. 
It validates the user comment against the set of pre-decided unacceptable words that should be avoided in the comments that appear in the product page. 
If the user comment found to contain any of those words, the response will be an appropriate message in the JSON format. 
The front end application can appropriately dispaly to user.
In both the situation, the response will be sent accordingly.
