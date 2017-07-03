package br.com.giovannicaprio.RestaurantPooling.controllers;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.giovannicaprio.RestaurantPooling.repository.UserRepository;
import br.com.giovannicaprio.RestaurantPooling.models.User;


@RestController
@RequestMapping("/User")
public class UserController
{

   @Autowired 
   private UserRepository userRepository;
   
   @PersistenceContext	
	private EntityManager entityManager;	
   
   @RequestMapping(
           value = "/all",
           method = RequestMethod.GET,
           produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<Collection<User>> getUsers() {

	   Collection<User> users = userRepository.findAll();
       
       if(users.isEmpty()){

    	   return new ResponseEntity<Collection<User>>(users,
    			   HttpStatus.INTERNAL_SERVER_ERROR);
       }

       return new ResponseEntity<Collection<User>>(users,
               HttpStatus.OK);
   }
   
   @RequestMapping(
           value = "/login/{name}/{password}",
           method = RequestMethod.GET,
           produces = MediaType.APPLICATION_JSON_VALUE)
   public String login(@PathVariable("name") String name, @PathVariable("password") String password) {
	   User user = userRepository.findByNameAndPassword(name, password);
	   if(user == null){
 	      return "redirect:/erro";
	   }
	   
	      return "redirect:/done";
   }
   
   @RequestMapping(
           value = "/logar/{data}",
           method = RequestMethod.GET,
           produces = MediaType.APPLICATION_JSON_VALUE)
   public String login(@PathVariable("name") User data) {
	   String name =  data.getName();
	   String password =  data.getPassword();
	   User user = userRepository.findByNameAndPassword(name, password);
	   if(user == null){
 	      return "redirect:/erro";
	   }
	   
	      return "redirect:/done";
   }
	    
	     	   
	   /*String hql = "FROM User as us WHERE atcl.name = ? and us.password = ?";
		int count = entityManager.createQuery(hql).setParameter(1, name).getResultList().size();
		boolean result = count > 0 ? true : false;
    		   
    		   
       if(!result){
    	      return "redirect:/erro";
       }

	      return "redirect:/done";*/
   
   /*@GetMapping("/form")
   public ModelAndView form(User User)
   {
      ModelAndView modelAndView = new ModelAndView("User/form-add");
      return modelAndView;

   }

   @PostMapping
   public ModelAndView save(@Valid User User, BindingResult bindingResult)
   {
      if (bindingResult.hasErrors())
      {
         return form(User);
      }
      UserDao.save(User);
      return new ModelAndView("redirect:/User");
   }

   @GetMapping("/{iduser}")
   public ModelAndView load(@PathVariable("iduser") Integer id)
   {
      ModelAndView modelAndView = new ModelAndView("User/form-update");
      modelAndView.addObject("User", UserDao.findById(id));
      return modelAndView;
   }

   @GetMapping
   public ModelAndView list(@RequestParam(defaultValue = "0", required = false) int page)
   {
      ModelAndView modelAndView = new ModelAndView("User/list");
      modelAndView.addObject("paginatedList", UserDao);
      return modelAndView;
   }

   //just because get is easier here. Be my guest if you want to change.
   @GetMapping("/remove/{iduser}")
   public String remove(@PathVariable("iduser") Integer id)
   {
      User User = UserDao.findById(id);
      UserDao.remove(User);
      return "redirect:/User";
   }

   @PostMapping("/{iduser}")
   public ModelAndView update(@PathVariable("iduser") Integer id, @Valid User User, BindingResult bindingResult)
   {
      User.setId(id);
      if (bindingResult.hasErrors())
      {
         return new ModelAndView("User/form-update");
      }
      UserDao.update(User);
      return new ModelAndView("redirect:/User");
   }*/
}

