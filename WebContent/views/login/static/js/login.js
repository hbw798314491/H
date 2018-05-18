	var username = document.getElementById("id_email");
	var password = document.getElementById("id_password");
	username.onkeyup = function(e) {
		if(this.value) {
			document.getElementById("idPlaceholder").className = "placeholder input";
		} else {
			document.getElementById("idPlaceholder").className = "placeholder";
		}
	}
	password.onkeyup = function(e) {
		if(this.value) {
			document.getElementById("pwdPlaceholder").className = "placeholder input";
		} else {
			document.getElementById("pwdPlaceholder").className = "placeholder";
		}
	}


