#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#parse("Class Header.java")
public enum ${NAME}
{
  #parse("SVN Id.java")
}
