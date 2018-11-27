package com.niit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;


@Controller
public class CategoryController {
	@Autowired
    CategoryDAO categoryDAO;
	 @RequestMapping(value="/all/addCategory", method=RequestMethod.POST)
	 public ModelAndView Success(@ModelAttribute("Categorys")Category category)
	 {
		 categoryDAO.addCategory(category);
		 ModelAndView model=new ModelAndView("AddCategory","Category",new Category());
		 return model;
		 
	 }
	 @RequestMapping(value="/all/AddCategory",method=RequestMethod.GET)
	 public ModelAndView getLogin(@ModelAttribute("Categorys")Category category)
	 
	 {
		 System.out.println("category");
		 ModelAndView model=new ModelAndView("AddCategory");
		 return model;
	 }
	 @RequestMapping(value="/all/ViewCategory", method=RequestMethod.GET)
		public ModelAndView getViewCategoryForm(@ModelAttribute("Categorys") Category category)
		{
				System.out.println("ViewCategory");	
				ModelAndView model = new ModelAndView();
		        model.addObject("categorylist", categoryDAO.getAllCategory());
		        model.setViewName("ViewCategory");
		        return model;
		}
	 @RequestMapping(value="/all/DeleteCategory", method = RequestMethod.GET)
		public ModelAndView deleteCategory(Model m, @RequestParam int id)
		{

		    categoryDAO.deleteCategory(id);
		    System.out.println("DeleteCategory");
		    ModelAndView model = new ModelAndView();
		    model.addObject("categorylist", categoryDAO.getAllCategory());
	        model.setViewName("ViewCategory");
			return model;
		}
	 @RequestMapping(value="/all/EditCategory",method = RequestMethod.GET)
		public ModelAndView getEdit(@RequestParam int id,Model m)
		{
			Category category=categoryDAO.selectCategory(id);
		    m.addAttribute("Cate",category);
			ModelAndView model = new ModelAndView("EditCategory","Category",new Category());
			return model;
			
		}
		@RequestMapping(value="/all/edit", method=RequestMethod.POST)
		public ModelAndView editCategory(@ModelAttribute("cate") Category category)
		{
				categoryDAO.updateCategory(category);
				ModelAndView model = new ModelAndView();
		        model.addObject("categorylist", categoryDAO.getAllCategory());
		        model.setViewName("ViewCategory");
				return model;
		       
		}
	 
}
