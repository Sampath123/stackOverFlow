package com.hashedin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hashedin.model.Comment;
import com.hashedin.service.CommentService;

@Controller
public class CommentControllerJPA {

    @Autowired
    CommentService commentService;

    @RequestMapping(method=RequestMethod.GET, value = "/comments/persistence")
    public ModelAndView getView(@ModelAttribute("comments") Comment comment) {
        return new ModelAndView("addComment");
    }
    
    @RequestMapping(method=RequestMethod.POST, value = "/comments/persistence")
    public ModelAndView add(Model model, @ModelAttribute("comments") Comment comment) {
        comment = commentService.save(comment);
        return new ModelAndView("commentAddedWithId", "comment", comment);
    }
}
