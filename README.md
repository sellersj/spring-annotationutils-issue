# spring-annotationutils-issue

When updating spring from 5.1.x to 5.2.x the AnnotationUtils.findAnnotation method no longer find annotations
that are on parent classes.

This has a single test that will demo this. Change the pom version of spring to see the change in behaviour.

Spring issue created
https://github.com/spring-projects/spring-framework/issues/23929

Possibly related, but fixed in 5.2.1
https://github.com/spring-projects/spring-framework/issues/23856

Originally asked
https://stackoverflow.com/questions/58649600/spring-annotationutils-in-5-2-no-longer-searching-parent-classes
