<template>
    <div>
      <blog-header></blog-header>
      <hr>
      <div>这是首页，哈哈哈</div>
      <hr>
      <blog-footer></blog-footer>
    </div>
</template>

<script>
    import blogHeader from "@/components/common/header.vue";
    import blogFooter from "@/components/common/footer.vue";

    export default {
        name: "BlogIndex",
        // blogHeader/blogFooter组件给申明到components里面然后在template里面使用
        components: { blogHeader, blogFooter }
    };
</script>

<style scoped>

</style>
