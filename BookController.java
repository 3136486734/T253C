package com.zking.ssm.controller;

@Controller
public class BookController{
  @Autowired
  private IBookService bookService;
  
  @RequestMapping("/toBookAdd")
  public String toBookAdd(){
	  return "book/addBook";
  }
}
