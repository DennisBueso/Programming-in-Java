package com.github.bbkpij201675.programminginjava.day07.stringstack;

/**
 * A node in a dynamic singly-linked list of Strings.
 */
public class StringStackNode {
  private String content;
  private StringStackNode next;

  public StringStackNode(String txt) {
    content = txt;
    next = null;
  }

  /**
   * Returns the string in this node.
   */
  public String getText() {
    return content;
  }

  /**
   * Set the next node to point to the given node.
   */
  public StringStackNode getNext() {
    return next;
  }

  /**
   * Set the next node to point to the given node.
   */
  public void setNext(StringStackNode node) {
    next = node;
  }
}
