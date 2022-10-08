$(document).ready(function() {
	$('.user-form').on('focusout', 'input', function() {
		const $this = $(this);
		const inputType = $this.data('inputType');
		const inputTypeKor = getInputTypeKor(inputType);
		if(!$this.val()) {
			$('.error-message[data-message-for="' + inputType + '"]').text(inputTypeKor + '을(를) 입력해주세요.');
		} else {
			$('.error-message[data-message-for="' + inputType + '"]').text('');
		}
	}).on('click', 'button[data-forget-type]', function() {
		const forgetType = $(this).data('forgetType');
		location.href = "forget/" + forgetType;
	});
});

function getInputTypeKor(inputType) {
	if(inputType === 'user-id') return '아이디';
	if(inputType === 'password') return '비밀번호';
	if(inputType === 'name') return '이름';
	if(inputType === 'email') return '이메일';
	return '';
}