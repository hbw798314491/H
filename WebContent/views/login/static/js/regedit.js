/**
 * 2018/4/30 
 * by:Tommy
 */

	var _name     = document.getElementById("id_name");
	var _user     = document.getElementById("id_user");
	var _password = document.getElementById("id_password");
	var _class    = document.getElementById("id_class");
	
	_user.maxLength = 11;
	_password.maxLength = 30;
	_name.maxLength = 5;
	_class.maxLength = 1;
	
	

	_name.onkeyup    = function(e) {
		if(this.value) {
			document.getElementById("naPlaceholder").className = "placeholder input";
		} else {
			document.getElementById("naPlaceholder").className = "placeholder";
		}
	}
	_user.onkeyup     = function(e) {
		if(this.value) {
			document.getElementById("usPlaceholder").className = "placeholder input";
		} else {
			document.getElementById("usPlaceholder").className = "placeholder";
		}
	}
	_password.onkeyup = function(e) {
		if(this.value) {
			document.getElementById("pwdPlaceholder").className = "placeholder input";
		} else {
			document.getElementById("pwdPlaceholder").className = "placeholder";
		}
	}
	_class.onkeyup    = function(e){
		if(this.value){
			document.getElementById("cldPlaceholder").className="placeholder input";
		}else{
			document.getElementById("cldPlaceholder").className="placeholder";
		}
	}

	
	