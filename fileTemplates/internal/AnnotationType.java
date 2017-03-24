#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#parse("Class Header.java")
public @interface ${NAME}
{
  #parse("SVN Id.java")
}
