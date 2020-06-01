(function() {
 function getCurrentUserData()
{
var user;
     AJS.$.ajax({
        url: "/rest/api/user/current",
        type: 'get',
        dataType: 'json',
        async: false,
        success: function(data) {
            user = data.username;
        }
     });
     return user;
}
alert("User:" + getCurrentUserData());
})();
