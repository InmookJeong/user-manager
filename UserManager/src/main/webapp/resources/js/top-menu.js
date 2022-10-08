$(document).ready(function() {
	$('#topMenu').on('click', 'button[data-btn-type]', function() {
		const btnType = $(this).data('btnType');
		location.href = btnType;
	}).on('click', '#logo', function(){
		location.href = '/user';
	});;
});