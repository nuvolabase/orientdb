/* Generated By:JJTree: Do not edit this line. OServerStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

public class OServerStatement extends SimpleNode {
  public OServerStatement(int id) {
    super(id);
  }

  public OServerStatement(OrientSql p, int id) {
    super(p, id);
  }


  /**
   * Accept the visitor.
   **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=86cab5eeff02ee2a2f8c5e0c0a017e6b (do not edit this line) */