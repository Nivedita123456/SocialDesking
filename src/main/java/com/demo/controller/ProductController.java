package com.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Desk;
import com.demo.bean.Floor;
import com.demo.bean.Location;
import com.demo.bean.Office;
import com.demo.bean.Product;
import com.demo.excpetion.ResourceNotFoundException;
import com.demo.service.DeskService;
import com.demo.service.FloorService;
import com.demo.service.LocationService;
import com.demo.service.OfficeService;
import com.demo.service.ProductService;

@RestController
//@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	@Autowired
	LocationService locationService;
	@Autowired
	OfficeService officeService;
	@Autowired
	FloorService floorService;
	
	@GetMapping("/viewProducts")
	public ModelAndView displayAllProduct(){
		List<Product> plist=productService.getAllProduct();
		return new ModelAndView("displayAllProduct","plist",plist);
	}
	@GetMapping("/viewLocation")
	public List<Location> displayAllLocation(){
		
		return locationService.getAllLocation();
	}
	@GetMapping("/viewNameLocation/{name}")
	public List<Location> displayAllNameLocation(@PathVariable String name){
		return locationService.getByName(name);
	}
	@GetMapping("/viewOffice")
	public List<Office> displayAlloffice(){
		return officeService.getAllOffice();
	}
	@GetMapping("/selectDesk/{name}")
	public List<Floor> displayAllDesk(@PathVariable String name){
		Office office=officeService.getByName(name);
	List<Floor> floor=floorService.getFloorById(office.getId());
	//loop check all floors booking desk there or not for particular office location
	//if empty then all floors available
	//else check for the one which are booked and their adjacent will not be returned
	//return the floor wise array of numbers
	//logic of displaying to be written in that
		return floor;
	}
	@GetMapping("/addProduct")
	public String addProduct() {
		return "saveproduct";
	}
	
	@GetMapping("/saveProduct")
	public ModelAndView save(@RequestParam int pid,@RequestParam String pname,@RequestParam double price) {
		Product p=new Product(pid,pname,price);
		productService.addProduct(p);
		return new ModelAndView("redirect:/viewProducts");
	}	
	
	@GetMapping("/editProduct/{id}")
	public ModelAndView editProduct(@PathVariable("id") int id) {
		Optional<Product> p=productService.getProductById(id);
		if(p.isPresent()) {
		return new ModelAndView("editproduct","prod",p.get());}
		else {
			throw new ResourceNotFoundException("product","pid",id);
		}
		
	}
	@GetMapping("/updateProduct")
	public ModelAndView updateProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam double price) {
		Product p=new Product(pid,pname,price);
		productService.updateProductById(p);
		return new ModelAndView("redirect:/viewProducts");
	}
	@GetMapping("/deleteProduct/{pid}")
	public ModelAndView deleteProduct(@PathVariable int pid) {
		productService.deleteProductById(pid);
		return new ModelAndView("redirect:/viewProducts");
	}

}
