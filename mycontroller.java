package pavanmotors.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class mycontroller {
	
	@RequestMapping("/")
	public ModelAndView pavan(){
		System.out.println("\nController - / ");
		ModelAndView pr= new ModelAndView("Tvscaursol");
		return pr;
	}
	
	@RequestMapping("/TvsXLsuper")
	public ModelAndView pavan995(){
		System.out.println("\nController 1 - / ");
			ModelAndView pravm= new ModelAndView("TvsXLsuper");
			return pravm;
			}
	
@RequestMapping("/TvsXl100")
public ModelAndView pavan99(){
	System.out.println("\nController 3- / ");
		ModelAndView prav= new ModelAndView("TvsXl100");
		return prav;
		}
	
@RequestMapping("/TvsScootypep")
public ModelAndView pavan999(){
	System.out.println("\nController 4- / ");
		ModelAndView pra= new ModelAndView("TvsScootypep");
		return pra;
		}
@RequestMapping("/TvsZest")
public ModelAndView pavan98(){
	System.out.println("\nController 5- / ");
		ModelAndView praz= new ModelAndView("TvsZest");
		return praz;
		}
@RequestMapping("/TvsStarcity")
public ModelAndView pavan97(){
	System.out.println("\nController 6- / ");
		ModelAndView praq= new ModelAndView("TvsStarcity");
		return praq;
		}
@RequestMapping("/ApacheTVS")
public ModelAndView pavan95(){
	System.out.println("\nController 7 - / ");
		ModelAndView praw= new ModelAndView("ApacheTVS");
		return praw;
		}
@RequestMapping("/signup")
public ModelAndView pavan953(){
	System.out.println("\nController 7 - / ");
		ModelAndView prawb= new ModelAndView("signup");
		return prawb;
		}
@RequestMapping("/login1")
public ModelAndView pavan952(){
	System.out.println("\nController 8 - / ");
		ModelAndView prawk= new ModelAndView("login1");
		return prawk;
		}

}
