app.controller("MainController", function ($scope,$location,$http) {
    $scope.login = function () {
        $scope.dataLoading = true;
        $http.post('/signin/',{username:$scope.username,password:$scope.password} ).success(function (data, status, headers, config){
            if(data =="ok") {
                window.location='/user/';
            } else {
                $scope.error = 'Wrong username or password';
                $scope.dataLoading = false;
            }

        });
    };

    //Testing phases

    $scope.registerCandidates= function () {
      $http.post("/registercandidates/",{names:$scope.names,password:$scope.pwd,email:$scope.email,phone:$scope.phone}).success(function(data,status,headers,config){
         if(data=='ok'){
             $scope.successmsg="Candidates registered success";
         }
      });
    }
    $scope.viewCandidates= function () {
     $http.get('/loadCandidates/').success(function(data,status,headers,config){
        $scope.candidates=data;
    });
}
    $scope.disableCandidates= function (id) {
        $http.get('/disableCandidates/'+id+'/').success(function(data,status,headers,config){
            $scope.feedmsg=data;
        });
    }
    $scope.updateCandidates= function () {
        $http.post('/updatecandidates/'+$scope.id+'/',{names:$scope.names,password:$scope.pwd,email:$scope.email,phone:$scope.phone}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updatesuccessmsg="Candidates updated success";
            }
        });
        alert($scope.id);
    }
    $scope.loadUpdater= function (id) {
        $http.get('/loadCandidatesById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updcand=data;
        });
    }
    $scope.searchCandidates= function () {
        if($scope.keyword!=''){
        $http.get('/searchCandidates/'+$scope.keyword+'/').success(function(data,status,headers,config){
            $scope.candidates=data;
        });
    }else{
            $scope.viewCandidates();
        }
    }
});