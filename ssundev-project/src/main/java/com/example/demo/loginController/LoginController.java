package com.example.demo.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.UserVo.UserVo;
import com.example.demo.loginService.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	/*
	 * public LoginController(LoginService loginService) {
	 * 	this.loginService =
	 * 	loginService;
	 * }
	 */
	
	/**
	 * 로그인페이지의 로그인
	 * @param userVo
	 * @param textUserVo
	 * @return
	 */
	@PostMapping("/login")
	public String Login(@ModelAttribute("UserLogin") UserVo userVo, 
						@RequestBody String textUserVo ) {
		System.out.println("로긴성공");
		System.out.println(textUserVo);
		
		/*vo 객체로 받아오게 수정*/
		/*if 분기처리로 성공 실패 리턴*/
		

		return "redirect:/main";
	}
	/**
	 * 회원가입 페이지 진입
	 * @return
	 */
	@GetMapping("/ContextUs")
	public String IntoContextUs() {
		System.out.println("컨택트진입");
		return "login/ContextUs";
	}
	/**
	 * 회원가입양식 제출
	 * @return
	 */
	@PostMapping("/JoinUs")
	public String JoinUs() {
		/*성공 혹은 실패 */
		System.out.println("회원가입양식제출");
		String s = loginService.contextUs();
		System.out.println(s);
		return "redirect:/login";
	}
	
	
	
	
	
	
	
	
	
/*
	
	@GetMapping("/m_m/RawMaterialsArrivalWearingManageListPop_None_ModifyView")	
	public String RawMaterialsArrivalWearingManageListPop_None_ModifyView(Map<String, Object> map, Model model, @RequestParam Map<String, Object> paramMap) 
			throws Exception {		map.putAll(paramMap);		
			model.addAttribute("companyNameTitle", 
					CommonCodeService.companyName);
			//로긴했을시 값 세팅		
			//구매방식	
			paramMap.put("req_site_seq", session.getAttribute("userSiteSeq"));
			// 추후에는 세션이나 조회 값을 통해서 가져올수 있도록..	
			paramMap.put("req_code_so_codes_yn", CommonCodeService.value_Y); 
			//사용되는 코드만..		
			paramMap.put("req_codej_code", "00030038"); 
			//구매방식 00030038		
			List<Map<String, Object>> prod_purchase_way_list = null;	
			//일단 값을 보여주기 위해서 하드코딩 하고 나중에 코드 가져와서 뿌림	
			prod_purchase_way_list = commonCodeService.commonCode_Code_So_Select(paramMap);	
			String prod_purchase_way_item_str = "";	
			for (Map<String, Object> check_item: prod_purchase_way_list) {	
				prod_purchase_way_item_str = prod_purchase_way_item_str + String.valueOf(check_item.get("codes_code")) +":"+check_item.get("codes_code_nm") + ";" ;	
				}		
			prod_purchase_way_item_str = prod_purchase_way_item_str.substring(0, prod_purchase_way_item_str.length()-1);
			//마지막 ; 제거		
			model.addAttribute("prod_purchase_way_item_str", prod_purchase_way_item_str);		
			model.addAttribute("menu_Name", "자재입고관리");		
			return "pages/m_m/RawMaterialsArrivalWearingManageListPop_None_Modify";	
			}
	//경주공장만 사용//	
	@PostMapping("/m_m/ExcelUpload")//	
	public ResponseEntity<?> ExcelUploadfile(@RequestPart("file1") MultipartFile multipartFile,
											@RequestParam Map<String, Object> formData) throws Exception {
		//		
		Map<String, Object> responseMap = rawMaterialsArrivalWearingManageListService.excelUploadfile(multipartFile, formData);
		//		
		return new ResponseEntity<>(responseMap, HttpStatus.OK);
		//	}}
	}
*/	
	
	
	
	
	
	
	
	
}
