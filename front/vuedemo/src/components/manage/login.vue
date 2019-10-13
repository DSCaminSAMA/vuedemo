<template>
  <div>
    <blog-header></blog-header>
    <hr>
    <Form ref="formInline" :model="loginInfoVo" :rules="ruleInline" inline>
      <FormItem prop="username">
        <Input type="text" v-model="loginInfoVo.username" placeholder="用户名">
          <Icon type="ios-person-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <br/>
      <FormItem prop="password">
        <Input type="password" v-model="loginInfoVo.password" placeholder="密码">
          <Icon type="ios-lock-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <br>
      <FormItem>
        <Button type="primary" @click="UserLogin">登录</Button>
      </FormItem>
    </Form>
    <hr>
    <blog-footer></blog-footer>
  </div>
</template>

<script>
    import BlogHeader from "../common/header.vue";
    import BlogFooter from "../common/footer.vue";
    import {UserLoginAction} from "../../api/user";

    export default {
        name: "Login",
        components: {BlogHeader,BlogFooter},
        data(){
            return {
                formInline:{
                    username:'',
                    password:''
                },
                loginInfoVo:{
                    username: "",
                    password: ""
                },
                responseResult:[],
                login:true,
                ruleInline:{
                    username:[{
                        required:true,
                        message:'请输入用户名',trigger:'blur'
                    }],
                    password:[{
                        required: true,
                        message: '请输入密码',trigger: 'blur'
                    },{type:'string',min:6,message: '请输入六位以上的密码'}]
                }
            }
        },
        methods:{
            UserLogin(){
                UserLoginAction(this.loginInfoVo).then(res => {
                    if (this.loginInfoVo.username=="" || this.loginInfoVo.password==""){
                        this.$Message.success("账号不能为空!");
                    }else if (res.data==true){
                        this.$Message.success("成功!");
                        this.$router.push({path:`/HelloWorld`});
                    }else {
                        this.$Message.success("账号和密码错误！")
                    }
                })
            }
        }
    }
</script>

<style scoped>

</style>
