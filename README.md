# spring-annotationutils-issue

When updating spring from 5.1.x to 5.2.x the AnnotationUtils.findAnnotation method no longer find annotations
that are on parent classes.

This has a single test that will demo this. Change the pom version of spring to see the change in behaviour.
