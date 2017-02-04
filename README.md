boot-stateless-auth
===================

folked from https://github.com/Robbert1/boot-stateless-auth
updated to latest versions including spring boot 1.5.1
delete Test as I can't run through due to the breaking change of Spring Boot Test

Needs Gradle 3 and JDK 7

build with `gradle build`  
run with `gradle bootRun`
open browser localhost:8080

===================

NOTICE 
===================

This code is really just to serve as a working example of the related blog post:
http://blog.jdriven.com/2014/10/stateless-spring-security-part-2-stateless-authentication

While I have no problem with people using bits of the code it is not meant as a library 
or template for new projects as the code is unmaintained and generally outdated.

Since the posting of the blog, Spring Security has made big steps to 
support additional means of authentication supporting all sorts of scenarios. 
I'd strongly recommend taking a close look at their latest blogs.
