package pattern

final case class SubclassResponsibility(val message: String = "", val cause: Throwable = None.orNull)
  extends Exception(message, cause)
